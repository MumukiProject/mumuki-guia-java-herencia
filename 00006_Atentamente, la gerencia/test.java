gerente = new Gerente();
jefe = new Jefe();

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