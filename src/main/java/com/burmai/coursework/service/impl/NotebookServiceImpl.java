package com.burmai.coursework.service.impl;

import com.burmai.coursework.dto.NotebookDto;
import com.burmai.coursework.model.Notebook;
import com.burmai.coursework.repository.NotebookRepository;
import com.burmai.coursework.service.NotebookService;
import com.burmai.coursework.service.mapper.NotebookMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class NotebookServiceImpl implements NotebookService {

    private NotebookRepository notebookRepository;

    private NotebookMapper notebookMapper;

    @Override
    public List<Notebook> getAllNotebooks() {
        return notebookRepository.findAll();
    }

    @Override
    public NotebookDto getById(Integer id) {
        return notebookMapper.toDto(notebookRepository.getOne(id));
    }
}
