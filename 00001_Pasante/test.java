Pasante pasante = new Pasante();

@Test
public void un_pasante_no_tiene_gente_a_cargo() {
  Assert.assertFalse(pasante.genteACargo());
}

@Test
public void un_pasante_gana_100_pesos_por_hora() {
  Assert.assertEquals(100, pasante.sueldoPorHora());
}

@Test
public void si_un_pasante_trabaja_tres_horas_gana_300_pesos() {
  pasante.trabajar(3);
  Assert.assertEquals(300, pasante.dinero());
}
