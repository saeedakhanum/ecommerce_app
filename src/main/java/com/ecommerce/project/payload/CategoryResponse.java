package com.ecommerce.project.payload;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryResponse {
private List<CategoryDto> content;
private Integer pageNumber;
private Integer pageSize;
private Integer totalPages;
private Long totalElements;
private boolean lastPage;
private boolean previousPage;
}
