package com.example.spring.mogo.service;

import com.example.spring.mogo.documents.Message;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface MessageService {

	public Mono<Message> save(Message message);

	public Mono<Message> delete(String id);

	public Mono<Message> update(String id, Message message);

	public Flux<Message> findByThreadId(String threadId);

	public Flux<Message> findAll();

	public Mono<Message> findById(String id);

}
