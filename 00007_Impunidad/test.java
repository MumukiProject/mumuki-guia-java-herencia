Gerente gerente = new Gerente();
Gerente gerenteQueFalta = new Gerente();
Jefe jefe = new Jefe();

@Test
public void un_gerente_tiene_gente_a_cargo() {
  Assert.assertTrue(gerente.genteACargo());
}

@Test
public void un_gerente_gana_300_pesos_por_hora() {
  Assert.assertEquals(300, gerente.sueldoPorHora());
}

@Test
public void si_un_gerente_trabaja_seis_horas_gana_2000_pesos() {
  gerente.trabajar(6);
  Assert.assertEquals(2000, gerente.getDinero());
}

@Test
public void si_un_gerente_trabaja_cobra_200_pesos_mas_su_sueldo_por_hora() {
  gerente.trabajar(1);
  Assert.assertEquals(gerente.sueldoPorHora() + 200, gerente.getDinero());
}

@Test
public void un_gerente_paga_bono_a_un_jefe() {
  gerente.pagarBono(jefe);
  Assert.assertEquals(1000, jefe.getDinero());
}

@Test
public void un_gerente_que_falta_a_trabajar_no_es_penalizado() {
  gerenteQueFalta.faltarAlTrabajo();
  Assert.assertEquals(0, gerenteQueFalta.getDinero());
}