
package luminabe.Model.Admnistrador;
import luminabe.Model.Empresa.*;
import java.io.IOException;
import java.util.Random;

public class Testes {
    public static void main(String[] args) {
        ListaEmpresas listaEmpresas = new ListaEmpresas();

        // Gerar e cadastrar empresas listadas
        cadastrarEmpresas(listaEmpresas);

        try {
            // Gravar a lista de empresas em um arquivo
            ListaEmpresas.gravar("C:\\Users\\muril\\Desktop\\Nova pasta (2)\\empresas.dat", listaEmpresas);

            // Exibir a lista de empresas cadastradas
            System.out.println("Empresas cadastradas:");
            for (Empresa empresa : listaEmpresas.getEmpresas()) {
                System.out.println("Nome: " + empresa.getNomeEmpresa() + " - E-mail: " + empresa.getEmailEmpresa());
            }
        } catch (IOException e) {
            e.getMessage();
        }
    }

    // Método para cadastrar as empresas listadas
    private static void cadastrarEmpresas(ListaEmpresas listaEmpresas) {
        String[] nomesEmpresas = {
            "EcoVita - Energia vel", "Verde Horizonte - Paisagismo Sustentável", "BioCycle - Gestão de Resíduos",
            "SolaraTech - Painéis Solares", "AquaPure - Purificação de Água", "ReFloresta - Reflorestamento Urbano",
            "EcoMove - Transporte Sustentável", "TerraCycle - Reciclagem Inovadora", "GreenHouse - Agricultura Urbana",
            "BioEnergize - BioCombustíveis", "EcoWave - Energia das Ondas", "PureAir - Filtros de Ar Naturais",
            "NatureTech - Tecnologia Verde", "GreenFiber - Têxteis Sustentáveis", "SolarVista - Energia Solar Residencial",
            "EcoBuild - Construção Sustentável", "EarthCare - Conservação Ambiental", "ReCycleUp - Upcycling de Resíduos",
            "GreenLeaf - Produtos Orgânicos", "AquaGuard - Proteção dos Oceanos", "BioHarvest - Agricultura Biológica",
            "EcoClean - Limpeza Ecológica", "GreenWatt - Energia Eólica", "NatureCycle - Ciclo de Vida Sustentável",
            "PureSoil - Recuperação de Solo", "EcoFootprint - Consultoria Ambiental", "GreenGlow - Iluminação LED",
            "BioPlast - Plásticos Biodegradáveis", "FreshEco - Produtos Naturais", "SolarWind - Energia Híbrida"
        };

        Random random = new Random();
        for (int i = 0; i < nomesEmpresas.length; i++) {
            String nomeEmpresa = nomesEmpresas[i];
            String emailEmpresa = nomeEmpresa.toLowerCase().replace(" ", "") + "@example.com";
            String telefoneEmpresa = generateRandomPhoneNumber();
            String linkedin = "linkedin" + (i + 1);
            String facebook = "facebook" + (i + 1);
            String instagram = "instagram" + (i + 1);
            String endereco = "Endereço " + (i + 1);
            String uf = "UF" + (i + 1);
            String cidade = "Cidade " + (i + 1);
            String pais = "País " + (i + 1);
            String cep = generateRandomCEP();
            String senha = "senha" + (i + 1);
            String descEmpresa = "Descrição da " + nomeEmpresa;
            String imgEmpresa = "imagem" + (i + 1) + ".jpg";

            Empresa empresa = new Empresa(i + 1, "", "", nomeEmpresa, "Responsável " + (i + 1),
                    emailEmpresa, "responsavel" + (i + 1) + "@example.com", telefoneEmpresa,
                    generateRandomPhoneNumber(), "www." + nomeEmpresa.toLowerCase().replace(" ", "") + ".com",
                    linkedin, facebook, instagram, endereco, uf, cidade, pais, cep, senha, descEmpresa, imgEmpresa);

            listaEmpresas.adicionarEmpresa(empresa);
        }
    }

    // Método para gerar um número de telefone aleatório
    private static String generateRandomPhoneNumber() {
        Random random = new Random();
        StringBuilder phoneNumber = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            phoneNumber.append(random.nextInt(10));
        }
        return phoneNumber.toString();
    }

    // Método para gerar um CEP aleatório
    private static String generateRandomCEP() {
        Random random = new Random();
        StringBuilder cep = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            cep.append(random.nextInt(10));
        }
        return cep.toString();
    }
}
