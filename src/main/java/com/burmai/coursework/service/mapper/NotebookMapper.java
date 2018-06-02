package com.burmai.coursework.service.mapper;

import com.burmai.coursework.dto.NotebookDto;
import com.burmai.coursework.model.Notebook;
import org.springframework.stereotype.Component;

@Component
public class NotebookMapper {

    public Notebook toEntity(NotebookDto notebookDto){
        Notebook notebook = new Notebook();
        notebook.setId(notebookDto.getId());
        notebook.setName(notebookDto.getName());
        notebook.setPrice(notebookDto.getPrice());
        notebook.setHdd(notebookDto.getHdd());
        notebook.setSsd(notebookDto.getSsd());
        notebook.setScreenCover(notebookDto.getScreenCover());
        notebook.setScreenDiagonal(notebookDto.getScreenDiagonal());
        notebook.setScreenResolution(notebookDto.getScreenResolution());
        notebook.setScreenType(notebookDto.getScreenType());
        notebook.setCpuByCpuId(notebookDto.getCpuByCpuId());
        notebook.setGpuByGpuId(notebookDto.getGpuByGpuId());
        notebook.setWeight(notebookDto.getWeight());
        return notebook;
    }

    public NotebookDto toDto(Notebook notebook){
        NotebookDto notebookDto= new NotebookDto();
        notebookDto.setId(notebook.getId());
        notebookDto.setName(notebook.getName());
        notebookDto.setPrice(notebook.getPrice());
        notebookDto.setHdd(notebook.getHdd());
        notebookDto.setSsd(notebook.getSsd());
        notebookDto.setScreenCover(notebook.getScreenCover());
        notebookDto.setScreenDiagonal(notebook.getScreenDiagonal());
        notebookDto.setScreenResolution(notebook.getScreenResolution());
        notebookDto.setScreenType(notebook.getScreenType());
        notebookDto.setCpuByCpuId(notebook.getCpuByCpuId());
        notebookDto.setGpuByGpuId(notebook.getGpuByGpuId());
        notebookDto.setWeight(notebook.getWeight());
        return notebookDto;
    }
}
