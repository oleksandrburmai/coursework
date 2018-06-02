package com.burmai.coursework.service;

import com.burmai.coursework.dto.NotebookDto;
import com.burmai.coursework.model.Notebook;

import java.util.List;


public interface NotebookService {
    List<Notebook> getAllNotebooks();
    NotebookDto getById(Integer id);
}
