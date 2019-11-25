package br.com.sergio.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

import br.com.sergio.forum.model.Topico;

public class TopicoDto {
	
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	
	public TopicoDto(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
	}
	
	public Long getId() {
		return id;
	}
	public String getTitulo() {
		return titulo;
	}
	public String getMensagem() {
		return mensagem;
	}
	public LocalDateTime getDataCriacao() {
		return dataCriacao;
	}


	public static List<TopicoDto> converter(List<Topico> topicos) {
		
		return topicos.stream().map(TopicoDto::new).collect(Collectors.toList()); //pega topico por topico. transforma um por um em um TopicoDto e depois o retorna como uma List.
	
	}
}
