package com.example.spring.mogo.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.spring.mogo.documents.Clients;

@Repository
public interface ClientsRepository extends MongoRepository<Clients, Serializable> {

}
