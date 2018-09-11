Arbol arbol = new Arbol();

@Test
public void un_arbol_da_frutos() {
  Assert.assertTrue(arbol.daFrutos());
}

@Test
public void un_arbol_aumenta_10_hojas_al_crecer() {
  arbol.crecer();
  Assert.assertEquals(10, arbol.getCantidadDeHojas());
  arbol.crecer();
  Assert.assertEquals(20, arbol.getCantidadDeHojas());
}

@Test
public void un_arbol_hace_fotosintesis() {
  arbol.crecer();
  arbol.crecer();
  Assert.assertEquals(40, arbol.fotosintesis());
}
