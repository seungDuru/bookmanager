package com.example.bookmanager.service;

import com.example.bookmanager.domain.Author;
import com.example.bookmanager.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class AuthorService {
    private final AuthorRepository authorRepository;

    @Transactional(propagation = Propagation.REQUIRED)
    public void putAuthor(){
        Author author = new Author();
        author.setName("martin");

        authorRepository.save(author);

//        throw new RuntimeException("오류가 발생하였습니다. transaction은 어떻게 될까요?");
    }
}
