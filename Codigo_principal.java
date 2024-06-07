import java.util.*;

public class Main {

    // HYPER Classe Dano, Vida, Shield e Mana.
    public static class Personagem {
        private int dano;
        private int vida;
        private int shield;
        private int mana;

        public Personagem(int dano, int vida, int shield, int mana) {
            this.dano = dano;
            this.vida = vida;
            this.shield = shield;
            this.mana = mana;
        }

        // Métodos de retorno para o código principal (get).
        public int getDano() {
            return dano;
        }

        public void setDano(int dano) {
            this.dano = dano;
        }

        public int getVida() {
            return vida;
        }

        public void setVida(int vida) {
            this.vida = vida;
        }

        public int getMana() {
            return mana;
        }

        public void setMana(int mana) {
            this.mana = mana;
        }

        public int getShield() {
            return shield;
        }

        public void setShield(int shield) {
            this.shield = shield;
        }
    }

    // Hyper classe skills !!! tudo que tem "S_" é referente às skills.
    public static class Skills {
        private String nome; // Adicionando o campo nome
        private int S_dano;
        private int S_cura;
        private int S_shield;
        private int S_mana;

        public Skills(String nome, int S_dano, int S_cura, int S_shield, int S_mana) {
            this.nome = nome;
            this.S_dano = S_dano;
            this.S_cura = S_cura;
            this.S_shield = S_shield;
            this.S_mana = S_mana;
        }

        // Métodos de retorno para o código principal.
        public String getNome() {
            return nome;
        }


        public int getS_dano() { return S_dano; }
        public void setS_dano(int s_dano) { S_dano = s_dano; }

        public int getS_cura() { return S_cura; }
        public void setS_cura(int s_cura) { S_cura = s_cura; }

        public int getS_mana() { return S_mana; }
        public void setS_mana(int s_mana) { S_mana = s_mana; }

        public int getS_shield() { return S_shield; }
        public void setS_shield(int s_shield) { S_shield = s_shield; }
    }

    public static void main(String[] args) {
        // Mapa para linkar as skills com as classes.
        HashMap<String, HashMap<String, Skills>> skills_Das_Class = new HashMap<>();

        // Valores de cada classe (Dano, vida)
        Personagem Paladino = new Personagem(20, 600, 10, 100);
        Personagem Ladino = new Personagem(40, 155, 0, 100);
        Personagem Tank = new Personagem(30, 450, 0, 100);

        //segunda levoa de personagens
        Personagem Mago = new Personagem(10,200,5,300);
        Personagem Arqueiro = new Personagem(50,100,0,100);
        Personagem Druida =new Personagem(15,300,50,150);

        //terceira levoa de personagens
        Personagem Necromante = new Personagem(5,50,150,300);
        Personagem Anjo = new Personagem(25,300,20,300);
        Personagem Demonio = new Personagem(25,300,20,300);



        // Skills do PALADINO
        HashMap<String, Skills> Paladino_Skills = new HashMap<>();
        Paladino_Skills.put("Fé Inabalável", new Skills("Fé Inabalável",0, 50, 0, 0));
        Paladino_Skills.put("Oração divina", new Skills("Oração divina",10, 0, 0, 0));
        Paladino_Skills.put("Escudo sagrado", new Skills("Escudo sagrado",0, 0, 60, 0));
        Paladino_Skills.put("Sete Arcanjos", new Skills("Sete Arcanjos",0, 150, 80, 100));
        skills_Das_Class.put("Paladino", Paladino_Skills);

        // Skills do Tank
        HashMap<String, Skills> Tank_Skills = new HashMap<>();
        Tank_Skills.put("Avanço do berserk", new Skills("Avanço do berserk",30, 0, 0, 0));
        Tank_Skills.put("Ventos curativos", new Skills("Ventos curativos",0, 20, 0, 0));
        Tank_Skills.put("Ira do berserk", new Skills("Ira do berserk",30, 0, 0, 0));
        Tank_Skills.put("Despertar do berserk", new Skills("Despertar do berserk",150, 100, 50, 0));
        skills_Das_Class.put("Tank", Tank_Skills);

        // Skills Ladino
        HashMap<String, Skills> Ladino_Skills = new HashMap<>();
        Ladino_Skills.put("Bomba de fumaça", new Skills("Bomba de fumaça",0, 0, 100, 0));
        Ladino_Skills.put("Golpe baixo", new Skills("Golpe baixo",85, 0, 0, 0));
        Ladino_Skills.put("Trunfo roubado", new Skills("Trunfo roubado",20, 71, 0, 0));
        Ladino_Skills.put("Último suspiro", new Skills("Último suspiro",210, 0, 0, 0));
        skills_Das_Class.put("Ladino", Ladino_Skills);

        //_____________________________SEGUNDA LEVOA__________________________________________________
        //Skill Mago
        HashMap<String,Skills> Mago_Skills = new HashMap<>();
        Mago_Skills.put("bola de fogo",new Skills("bola de fogo",30,0,0,0));
        Mago_Skills.put("Barreira de Adamus",new Skills("Barreira de Adamus",0,0,50,0));
        Mago_Skills.put("Estaca de neve",new Skills("Estaca de neve",50,0,0,0));
        Mago_Skills.put("Raio de mana",new Skills("Raio de mana",55,0,0,0));
        Mago_Skills.put("Ventos do caos",new Skills("Ventos do caos",45,0,0,0));
        Mago_Skills.put("Cataclisma",new Skills("Cataclisma",200,0,0,0));
        skills_Das_Class.put("Mago",Mago_Skills);

        //Skill Arqueiro
        HashMap<String,Skills> Arqueiro_Skills =new HashMap<>();
        Arqueiro_Skills.put("Tiro certeiro",new Skills("Tiro certeiro",80,0,0,0));
        Arqueiro_Skills.put("Flecha envenenada",new Skills("Flecha envenenada",40,0,0,0));
        Arqueiro_Skills.put("Tiro Multiplo",new Skills("Tiro Multiplo",40,0,0,0));
        Arqueiro_Skills.put("Ultima Flecha",new Skills("Ultima Flecha",250,0,0,0));
        skills_Das_Class.put("Arqueiro",Arqueiro_Skills);

        //Skill Druida
        HashMap<String,Skills> Druida_Skills=new HashMap<>();
        Druida_Skills.put("Raízes Entrelaçadas",new Skills("Raízes Entrelaçadas",10,0,0,0));
        Druida_Skills.put("Chuva de Folhas",new Skills("Chuva de Folhas",30,0,0,0));
        Druida_Skills.put("Conexão com a Natureza",new Skills("Conexão com a Natureza",0,40,0,0));
        Druida_Skills.put("Ira da Natureza",new Skills("Ira da Natureza",100,50,40,10));
        skills_Das_Class.put("Druida",Druida_Skills);


        // _____________________________ SELEÇÃO DO SEU TIME__________________________________________________

        Scanner scanner = new Scanner(System.in);
        String[] timePronto = new String[4];
        Set<String> personagensSelecionados = new HashSet<>();

        while (personagensSelecionados.size() < 4) {
            System.out.print("Selecione 4 Classes (Paladino, Tank, Ladino, Druida, Mago, Arqueiro): ");
            String escolha = scanner.next().toLowerCase();

            if (personagensSelecionados.contains(escolha)) {
                System.out.println("Este personagem já foi selecionado. Escolha outro.");
            } else if (escolha.equals("tank") || escolha.equals("ladino") || escolha.equals("paladino")||
                    escolha.equals("arqueiro")||escolha.equals("druida")||escolha.equals("mago")) {
                timePronto[personagensSelecionados.size()] = escolha;
                personagensSelecionados.add(escolha);
            } else {
                System.out.println("Escolha inválida!");
            }
        }

        System.out.println("Seu time é:");
        for (int i = 0; i < 4; ++i) {
            System.out.println((i + 1) + ") " + timePronto[i].toUpperCase());
        }

        System.out.println("Deseja continuar? [SIM/NÃO]: ");
        String verificador = scanner.next().toLowerCase();

        while (!verificador.equals("sim")) {
            System.out.println("Por favor, selecione 'sim' para continuar.");
            System.out.println("Deseja continuar? [SIM/NÃO]: ");
            verificador = scanner.next().toLowerCase();
        }
        // _____________________________ SELEÇÃO DAS SKILLS__________________________________________________


        Scanner skillSelecionada = new Scanner(System.in);

        List<String> skillsEscolhidaPaladino = new ArrayList<>();
        List<String> skillsEscolhidaTank = new ArrayList<>();
        List<String> skillsEscolhidaLadino = new ArrayList<>();

        List<String> skillsEscolhidaMago = new ArrayList<>();
        List<String> skillsEscolhidaDruida = new ArrayList<>();
        List<String> skillsEscolhidaArqueiro = new ArrayList<>();

        HashMap<String, List<Skills>> habilidadesPorPersonagem = new HashMap<>();
        for (String classe : timePronto) {
            if (classe != null) {
                List<Skills> habilidadesSelecionadas = new ArrayList<>();

                // Verifica a classe atual e adiciona as habilidades correspondentes
                if (classe.equals("paladino")) {
                    habilidadesSelecionadas.addAll(Paladino_Skills.values());
                } else if (classe.equals("tank")) {
                    habilidadesSelecionadas.addAll(Tank_Skills.values());
                } else if (classe.equals("ladino")) {
                    habilidadesSelecionadas.addAll(Ladino_Skills.values());
                } else if (classe.equals("mago")) {
                    habilidadesSelecionadas.addAll(Mago_Skills.values());
                } else if (classe.equals("druida")) {
                    habilidadesSelecionadas.addAll(Druida_Skills.values());
                } else if (classe.equals("arqueiro")) {
                    habilidadesSelecionadas.addAll(Arqueiro_Skills.values());
                }

                habilidadesPorPersonagem.put(classe, habilidadesSelecionadas);
            }
        }
        // _______________________________ FINALIZANDO O TIME _____________________________________________
        for (String classe : timePronto) {
            if (classe != null) {
                System.out.print("Habilidades escolhidas para " + classe + ": ||");
                List<Skills> habilidades = habilidadesPorPersonagem.get(classe);
                for (Skills habilidade : habilidades) {
                    System.out.print(habilidade.nome + ", ");
                }
                System.out.println();
            }
        }
        System.out.println("\nTime escolhido: " + Arrays.toString(timePronto));
    }
}

