package luminabe.Model.Admnistrador;

import luminabe.Model.Empresa.*;
import java.io.IOException;
import java.util.List;
import java.util.Random;

public class Testes {

    public static void main(String[] args) {
        ListaInformacoes listaInformacoes = new ListaInformacoes();

        // Gerar e cadastrar informacoes
        cadastrarEmpresas(listaInformacoes);
        cadastrarChamados(listaInformacoes);
        cadastrarPostagensAleatorias(listaInformacoes);

        try {
            ListaInformacoes.gravar("C:\\Users\\muril\\Desktop\\Nova pasta (2)\\banco.dat", listaInformacoes);
            System.out.println("Empresas cadastradas:");
            for (Empresa empresa : listaInformacoes.getEmpresas()) {
                System.out.println("Nome: " + empresa.getNomeEmpresa() + " - E-mail: " + empresa.getEmailEmpresa());
            }
            System.out.println("\nChamados cadastrados:");
            for (Chamado chamado : listaInformacoes.getChamados()) {
                System.out.println("Data: " + chamado.getDataInicio() + " - Responsável: " + chamado.getNomeResponsavel());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Método para cadastrar as empresas listadas
    private static void cadastrarEmpresas(ListaInformacoes listaInformacoes) {
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

        String[] nomesResponsaveis = {
            "Naruto Uzumaki", "Sasuke Uchiha", "Sakura Haruno", "Kakashi Hatake", "Hinata Hyuga",
            "Shikamaru Nara", "Gaara", "Rock Lee", "Sai", "Tsunade Senju", "Jiraiya", "Orochimaru",
            "Itachi Uchiha", "Temari", "Kiba Inuzuka", "Choji Akimichi", "Neji Hyuga", "Tenten",
            "Kankuro", "Minato Namikaze",
            "Kushina Uzumaki", "Obito Uchiha", "Asuma Sarutobi", "Anko Mitarashi", "Shizune",
            "Konan", "Nagato", "Kisame Hoshigaki", "Deidara", "Hidan"
        };

        Random random = new Random();
        for (int i = 0; i < nomesEmpresas.length; i++) {
            String nomeEmpresa = nomesEmpresas[i];
            String nomeSemEspacos = nomeEmpresa.replace(" ", "");
            String[] partesNome = nomeSemEspacos.split("-");
            String emailEmpresa = partesNome[0] + "@" + partesNome[0] + ".com";
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

            tipoEmpresa tipo = gerarTipoEmpresaAleatorio();

            Empresa empresa = new Empresa(
                    i + 1, tipo, "", "", nomeEmpresa, nomesResponsaveis[i],
                    emailEmpresa, "responsavel" + (i + 1) + "@example.com", telefoneEmpresa,
                    generateRandomPhoneNumber(), "www." + nomeEmpresa.toLowerCase().replace(" ", "") + ".com",
                    linkedin, facebook, instagram, endereco, uf, cidade, pais, cep, senha, descEmpresa, imgEmpresa
            );

            listaInformacoes.adicionarEmpresa(empresa);
        }
    }

    // Método para cadastrar os chamados listados
    private static void cadastrarChamados(ListaInformacoes listaInformacoes) {
        String[] datasChamados = {
            "01.05.2024", "04.05.2024", "08.05.2024", "12.05.2024", "15.05.2024",
            "18.05.2024", "21.05.2024", "24.05.2024", "27.05.2024", "30.05.2024",
            "02.05.2024", "05.05.2024", "09.05.2024", "13.05.2024", "16.05.2024",
            "19.05.2024", "22.05.2024", "25.05.2024", "28.05.2024", "31.05.2024"
        };

        List<Empresa> empresas = listaInformacoes.getEmpresas();

        for (int i = 0; i < datasChamados.length; i++) {
            Empresa empresa = empresas.get(i);
            String dataInicio = datasChamados[i];
            Chamado chamado = new Chamado(empresa, dataInicio);
            listaInformacoes.adicionarChamado(chamado);
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

    // Método para gerar aleatoriamente o tipo de empresa
    private static tipoEmpresa gerarTipoEmpresaAleatorio() {
        Random random = new Random();
        int index = random.nextInt(tipoEmpresa.values().length);
        return tipoEmpresa.values()[index];
    }

    // Método para cadastrar postagens aleatórias
    private static void cadastrarPostagensAleatorias(ListaInformacoes listaInformacoes) {
        String[] titulos = {
            "Primeiro Post", "Sustentabilidade em Ação", "Inovações Verdes", "Energia Limpa", "Reciclagem Criativa"
        };

        String[] textos = {
            "Este é o conteúdo do primeiro post.", "Explorando novas formas de sustentabilidade.",
            "As inovações verdes que estão mudando o mundo.", "Tudo sobre energia limpa e renovável.",
            "Ideias criativas para reciclagem e reuso."
        };

        String[] urlsImagens = {
            "http://example.com/imagem1.jpg", "http://example.com/imagem2.jpg", "http://example.com/imagem3.jpg",
            "http://example.com/imagem4.jpg", "http://example.com/imagem5.jpg"
        };

        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            String titulo = titulos[random.nextInt(titulos.length)];
            String texto = textos[random.nextInt(textos.length)];
            String urlImagem = urlsImagens[random.nextInt(urlsImagens.length)];

            Blog postagem = new Blog(titulo, texto, urlImagem);
            listaInformacoes.adicionarPostagem(postagem);
        }
    }
}
