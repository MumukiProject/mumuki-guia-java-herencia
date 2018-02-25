arbol = new Arbol();

@Test
public void un_arbol_da_frutos() {
  Assert.assertTrue(arbol.daFrutos());
}

@Test
public void un_arbol_aumenta_10_hojas_al_crecer() {
  arbol.crecer();
  Assert.assertEquals(10, arbol.cantidadDeHojas());
  arbol.crecer();
  Assert.assertEquals(20, arbol.cantidadDeHojas());
}

@Test
public void un_arbol_hace_fotosintesis() {
  arbol.hacerFotosintesis();
  Assert.assertEquals(40, arbol.hacerFotosintesis());
}
