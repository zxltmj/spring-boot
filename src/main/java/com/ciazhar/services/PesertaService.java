package com.ciazhar.services;

import com.ciazhar.dao.PesertaDao;
import com.ciazhar.model.Peserta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.util.List;

/*
Anotasi Service digunakan untuk menandai bahwa class itu service
*/
@Service
public class PesertaService implements PesertaDao {

    @Autowired
    private EntityManagerFactory entityManagerFactory;



    @Override
    public List<Peserta> daftarPeserta() {
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        return entityManager.createQuery("from Peserta", Peserta.class).getResultList();
    }
}
