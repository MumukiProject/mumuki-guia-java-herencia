Jefe jefe = new Jefe();

@Test
public void un_jefe_tiene_gente_a_cargo() {
  Assert.assertTrue(jefe.genteACargo());
}

@Test
public void un_jefe_gana_200_pesos_por_hora() {
  Assert.assertEquals(200, jefe.sueldoPorHora());
}

@Test
public void si_un_jefe_trabaja_cinco_horas_gana_1000_pesos() {
  jefe.trabajar(5);
  Assert.assertEquals(1000, jefe.getDinero());
}
