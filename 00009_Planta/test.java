Planta planta = new Planta();

@Test
public void una_planta_da_frutos() {
  Assert.assertTrue(planta.daFrutos());
}

@Test
public void una_planta_aumenta_5_hojas_al_crecer() {
  planta.crecer();
  Assert.assertEquals(5, planta.getCantidadDeHojas());
  planta.crecer();
  Assert.assertEquals(10, planta.getCantidadDeHojas());
}

@Test
public void una_planta_hace_fotosintesis() {
  planta.crecer();
  planta.crecer();
  Assert.assertEquals(20, planta.fotosintesis());
}

@Test
public void una_planta_se_marchita() {
  planta.crecer();
  planta.crecer();
  planta.crecer();
  planta.marchitarse();
  Assert.assertEquals(0, planta.getCantidadDeHojas());
}