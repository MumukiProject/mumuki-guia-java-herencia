Gerente gerente = new Gerente();
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
public void si_un_gerente_trabaja_seis_horas_gana_1800_pesos() {
  gerente.trabajar(6);
  Assert.assertEquals(1800, gerente.dinero());
}

@Test
public void un_gerente_paga_bono_a_un_jefe() {
  gerente.pagarBono(jefe);
  Assert.assertEquals(1000, jefe.dinero());
}

@Test
public void un_gerente_que_falta_a_trabajar_pierde_el_sueldo_de_cuatro_horas() {
  gerente.trabajar(5);
  gerente.faltarAlTrabajo();
  Assert.assertEquals(gerente.sueldoPorHora(), gerente.dinero());
}