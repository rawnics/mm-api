package com.awn.mm.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.awn.mm.entity.ChatMessageModel;

import java.util.List;

/**
 * @author huseyinbabal
 */
public interface ChatMessageRepository extends MongoRepository<ChatMessageModel, String> {
    List<ChatMessageModel> findAllByOrderByCreateDateAsc();
}
