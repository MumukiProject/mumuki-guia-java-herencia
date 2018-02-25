pasante = Pasante.new();

@Test
public void un_pasante_no_tiene_gente_a_cargo() {
  Assert.assertFalse(pasante.genteACargo());
}

@Test
public void un_pasante_gana_100_pesos_por_hora() {
  Assert.assertEquals(100, pasante.sueldoPorHora());
}
