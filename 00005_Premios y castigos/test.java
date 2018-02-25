Pasante pasante = Pasante.new();
Jefe jefe = Jefe.new();
Jefe jefeConBono = Jefe.new();

@Test
public void un_pasante_no_tiene_gente_a_cargo() {
  Assert.assertFalse(pasante.genteACargo());
}

@Test
public void un_pasante_gana_100_pesos_por_hora() {
  Assert.assertEquals(100, pasante.sueldoPorHora());
}

@Test
public void un_pasante_trabaja_tres_horas_y_gana_300_pesos() {
  pasante.trabajar(3);
  Assert.assertEquals(300, pasante.dinero());
}

@Test
public void un_jefe_tiene_gente_a_cargo() {
  Assert.assertTrue(jefe.genteACargo());
}

@Test
public void un_jefe_gana_200_pesos_por_hora() {
  Assert.assertEquals(200, jefe.sueldoPorHora());
}

@Test
public void un_jefe_trabaja_cinco_horas_y_gana_1000_pesos() {
  jefe.trabajar(5);
  Assert.assertEquals(1000, jefe.dinero());
}

@Test
public void un_pasante_que_falta_a_trabajar_pierde_el_sueldo_de_cuatro_horas() {
  pasante.trabajar(5);
  pasante.faltarAlTrabajo();
  Assert.assertEquals(pasante.sueldoPorHora(), pasante.dinero());
}

@Test
public void un_jefe_que_falta_a_trabajar_pierde_el_sueldo_de_cuatro_horas() {
  jefe.trabajar(5);
  jefe.faltarAlTrabajo();
  Assert.assertEquals(jefe.sueldoPorHora(), jefe.dinero());
}

@Test
public void un_jefe_cobra_bono_de_1000_pesos() {
  jefeConBono.cobrarBono();
  Assert.assertEquals(1000, jefe.dinero());
}