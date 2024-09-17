package com.example.samuraitravel.form;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ReviewEditForm {
	@NotNull
	private Integer id;
	
	@NotBlank(message = "評価を選択してください。")
	private String star;
	
	@NotBlank(message = "コメントを入力してください")
	private String comments;
	

}
