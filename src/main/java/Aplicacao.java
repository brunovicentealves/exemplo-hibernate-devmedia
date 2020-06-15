public class Aplicacao {

    public static void main(String[] args) {

        ProgramaCadastrar progcadastra = new ProgramaCadastrar();
        ProgramaListar    proglistar = new ProgramaListar();

        progcadastra.cadastrar();
        proglistar.listar();



    }
}
