package com.example.demo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookFromOpenLibraryDto {
    private AuthorFromOpenLibDto docs;
    private String title;
    private String key;
}
