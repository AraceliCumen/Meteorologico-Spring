package com.tiempo.mvc.model;

import java.time.LocalDate;

public class RegistroDatos {
	
	private LocalDate fecha;
	private String estacionMeteriologica;
	private String provincia;
	private TemperaturaHora maxima;
	private TemperaturaHora minima;
	private float precipitacion;
	
	public RegistroDatos(LocalDate fecha, String estacionMeteriologica, String provincia, TemperaturaHora maxima,
			TemperaturaHora minima, float precipitacion) {
		super();
		this.fecha = fecha;
		this.estacionMeteriologica = estacionMeteriologica;
		this.provincia = provincia;
		this.maxima = maxima;
		this.minima = minima;
		this.precipitacion = precipitacion;
	}
	
	@Override
	public String toString() {
		return "RegistroDatos [fecha=" + fecha + ", estacionMeteriologica=" + estacionMeteriologica + ", provincia="
				+ provincia + ", maxima=" + maxima + ", minima=" + minima + ", precipitacion=" + precipitacion + "]";
	}
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public String getEstacionMeteriologica() {
		return estacionMeteriologica;
	}
	public void setEstacionMeteriologica(String estacionMeteriologica) {
		this.estacionMeteriologica = estacionMeteriologica;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public TemperaturaHora getMaxima() {
		return maxima;
	}
	public void setMaxima(TemperaturaHora maxima) {
		this.maxima = maxima;
	}
	public TemperaturaHora getMinima() {
		return minima;
	}
	public void setMinima(TemperaturaHora minima) {
		this.minima = minima;
	}
	public float getPrecipitacion() {
		return precipitacion;
	}
	public void setPrecipitacion(float precipitacion) {
		this.precipitacion = precipitacion;
	}
}
