Arbusto arbusto = new Arbusto();

@Test
public void un_arbusto_da_frutos() {
  Assert.assertTrue(arbusto.daFrutos());
}

@Test
public void un_arbusto_aumenta_5_hojas_al_crecer() {
  arbusto.crecer();
  Assert.assertEquals(5, arbusto.getCantidadDeHojas());
  arbusto.crecer();
  Assert.assertEquals(10, arbusto.getCantidadDeHojas());
}

@Test
public void un_arbusto_hace_fotosintesis() {
  arbusto.crecer();
  arbusto.crecer();
  Assert.assertEquals(120, arbusto.fotosintesis());
}

@Test
public void una_arbusto_se_marchita() {
  arbusto.crecer();
  arbusto.crecer();
  arbusto.crecer();
  arbusto.marchitarse();
  Assert.assertEquals(0, arbusto.getCantidadDeHojas());
}