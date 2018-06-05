package com.burmai.coursework.controller;

import com.burmai.coursework.model.Notebook;
import com.burmai.coursework.repository.NotebookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/")
@AllArgsConstructor
public class NotebookController {

    private NotebookRepository notebookRepository;

    @GetMapping("/notebookList")
    public String allNotebook(Model model) {
        model.addAttribute("notebookList", notebookRepository.findAll());
        return "notebookList";
    }

    @GetMapping("/addNotebook")
    public String createNotebook(Model model) {
        model.addAttribute("Notebook", new Notebook());
        return "addNotebook";
    }

    @PostMapping("/addNotebook/new")
    public String submitNewNotebook(@ModelAttribute("Notebook") Notebook notebook) {
        notebookRepository.save(notebook);
        return "addNotebook";
    }


    @GetMapping("/notebookList/searchByHdd")
    public String getNotebookByHdd(@RequestParam(value = "hddMin") Integer hddMin,
                                   @RequestParam(value = "hddMax") Integer hddMax, Model model) {
        model.addAttribute("notebookList", notebookRepository.findAllByHddBetween(hddMin, hddMax));
        return "notebookList";
    }

    @GetMapping("/notebookList/searchBySsd")
    public String getNotebookBySsd(@RequestParam(value = "ssd") Integer ssd, Model model) {
        model.addAttribute("notebookList", notebookRepository.findAllBySsd(ssd));
        return "notebookList";
    }

    @GetMapping("/notebookList/searchByName")
    public String getNotebookByName(@RequestParam(value = "name") String name, Model model) {
        model.addAttribute("notebookList", notebookRepository.findAllByNameContains(name));
        return "notebookList";
    }

    @GetMapping("/notebookList/searchByPrice")
    public String getNotebookByPrice(@RequestParam(value = "min") Integer min,
                                     @RequestParam(value = "max") Integer max,
                                     Model model) {
        model.addAttribute("notebookList", notebookRepository.findAllByPriceIsBetween(min, max));
        return "notebookList";
    }

    @GetMapping("/notebookList/searchByScreenType")
    public String getNotebookByScreenType(@RequestParam(value = "screenType") String screenType, Model model) {
        model.addAttribute("notebookList", notebookRepository.findAllByScreenTypeEquals(screenType));
        return "notebookList";
    }

    @GetMapping("/notebookList/searchByScreenDiagonal")
    public String getNotebookByScreenDiagonal(@RequestParam(value = "screenDiagonal") Double screenDiagonal,
                                              Model model) {
        model.addAttribute("notebookList", notebookRepository.findAllByScreenDiagonal(screenDiagonal));
        return "notebookList";
    }

    @GetMapping("/notebookList/searchByScreenResolution")
    public String getNotebookByScreenResolution(@RequestParam(value = "screenResolution") String screenResolution,
                                                Model model) {
        model.addAttribute("notebookList", notebookRepository.findAllByScreenResolutionEquals(screenResolution));
        return "notebookList";
    }

    @GetMapping("/notebookList/searchByScreenCover")
    public String getNotebookByScreenCover(@RequestParam(value = "screenCover") String screenCover,
                                           Model model) {
        model.addAttribute("notebookList", notebookRepository.findAllByScreenCoverEquals(screenCover));
        return "notebookList";
    }

    @GetMapping("/notebookList/searchByRam")
    public String getNotebookByRam(@RequestParam(value = "ram") Integer ram,
                                   Model model) {
        model.addAttribute("notebookList", notebookRepository.findAllByRam(ram));
        return "notebookList";
    }
}
