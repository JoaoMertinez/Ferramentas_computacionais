public interface IDic {
    void inserir(Termo termo);
    String traduzir(String palavra);
    boolean remover(String palavra);
}
