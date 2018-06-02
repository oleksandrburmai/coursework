package com.burmai.coursework.controller;

import com.burmai.coursework.dto.NotebookDto;
import com.burmai.coursework.model.Cpu;
import com.burmai.coursework.model.Notebook;
import com.burmai.coursework.repository.CpuRepository;
import com.burmai.coursework.service.impl.NotebookServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
@AllArgsConstructor
public class NotebookController {

    private NotebookServiceImpl notebookService;
    private CpuRepository cpuRepository;


    @GetMapping
    public NotebookDto getNotebookById(@RequestParam Integer id) {
        return notebookService.getById(id);
    }

    @GetMapping("/noteall")
    public String notebookAll() {
        StringBuilder result = new StringBuilder();
        for (Notebook notebook : notebookService.getAllNotebooks()) {
            result.append(notebook.toString()).append("<br>");
            System.out.println(notebook.toString());
        }
        return result.toString();
    }

    @GetMapping("/cpuall")
    public String cpuAll() {
        StringBuilder result = new StringBuilder();
        for (Cpu cpu : cpuRepository.findAll()) {
            result.append(cpu.toString()).append("<br>");
            System.out.println(cpu.toString());
        }
        return result.toString();
    }
}
