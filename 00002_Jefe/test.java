jefe = Jefe.new();

@Test
public void un_jefe_tiene_gente_a_cargo() {
  Assert.assertTrue(jefe.genteACargo());
}

@Test
public void un_jefe_gana_200_pesos_por_hora() {
  Assert.assertEquals(200, jefe.sueldoPorHora());
}
