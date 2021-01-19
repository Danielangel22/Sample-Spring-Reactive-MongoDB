package com.example.spring.mogo.repository;

import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.example.spring.mogo.documents.Message;

import reactor.core.publisher.Flux;

public interface MessageRepository extends ReactiveMongoRepository<Message, String> {
	Flux<Message> findByThreadId(String threadId);
}
