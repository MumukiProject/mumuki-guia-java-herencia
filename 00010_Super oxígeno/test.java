Planta planta = new Planta();

@Test
public void una_planta_da_frutos() {
  Assert.assertTrue(planta.daFrutos());
}

@Test
public void una_planta_aumenta_5_hojas_al_crecer() {
  planta.crecer();
  Assert.assertEquals(5, planta.cantidadDeHojas());
  planta.crecer();
  Assert.assertEquals(10, planta.cantidadDeHojas());
}

@Test
public void una_planta_hace_fotosintesis() {
  planta.crecer();
  planta.crecer();
  Assert.assertEquals(120, planta.fotosintesis());
}

@Test
public void una_planta_se_marchita() {
  planta.crecer();
  planta.crecer();
  planta.crecer();
  planta.marchitarse();
  Assert.assertEquals(0, planta.cantidadDeHojas());
}