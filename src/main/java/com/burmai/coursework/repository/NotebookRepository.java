package com.burmai.coursework.repository;

import com.burmai.coursework.model.Notebook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NotebookRepository extends JpaRepository<Notebook, Integer>, JpaSpecificationExecutor {

    List<Notebook> findAll();

    List<Notebook> findAllByHddBetween(Integer hddMin, Integer hhdMax);

    List<Notebook> findAllBySsd(Integer ssd);

    List<Notebook> findAllByNameContains(String name);

    List<Notebook> findAllByPriceIsBetween(Integer min, Integer max);

    List<Notebook> findAllByScreenDiagonal(Double screenDiagonal);

    List<Notebook> findAllByScreenCoverEquals(String screenCover);

    List<Notebook> findAllByScreenResolutionEquals(String screenResolution);

    List<Notebook> findAllByScreenTypeEquals(String screenType);

    List<Notebook> findAllByRam(Integer ram);
}
