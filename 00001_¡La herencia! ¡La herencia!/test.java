@Test
public void una_llama_mide_en_promedio_1m_60cms() {
  Llama llama = new Llama();
  Assert.assertEquals(1.6, llama.alturaPromedio(), 0.1);
}

@Test
public void un_guanaco_mide_en_promedio_1m_60cms() {
  Guanaco guanaco = new Guanaco();
  Assert.assertEquals(1.6, guanaco.alturaPromedio(), 0.1);
}

@Test
public void un_guanaco_pesa_entre_90_y_100kg() {
  Guanaco guanaco = new Guanaco();
  Assert.assertEquals(90, guanaco.pesoMinimo(), 0.1);
  Assert.assertEquals(100, guanaco.pesoMaximo(), 0.1);
}


@Test
public void una_llama_pesa_entre_110_y_120kg() {
  Llama llama = new Llama();
  Assert.assertEquals(110, llama.pesoMinimo(), 0.1);
  Assert.assertEquals(120, llama.pesoMaximo(), 0.1);
}