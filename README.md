# TCG Catalog

O projeto é um sistema de catálogo de cartas TCG, uma plataforma pensada especialmente para colecionadores e jogadores de jogos como Magic: The Gathering, Pokémon, Yu-Gi-Oh! e outros.

Esse projeto tem o objetivo de praticar o uso de uma arquitetura de microsserviços em Java usando Spring Framework.

## Funcionalidades

O TCG Catalog tem o objetivo de facilitar o gerenciamento do acervo de cartas, permitindo que:

- Cadastro de Cartas Detalhado:
  - Permite registrar cada carta com informações completas, como nome, edição, raridade, tipo (criatura, feitiço, terreno, etc.), custo de mana/energia, texto de habilidade, poder/resistência (se aplicável), artista, condição, e um campo para curiosidades ou lore.

- Gerenciamento de Coleção Pessoal: 
  - Usuários podem adicionar as cartas que possuem em suas coleções pessoais, indicando a quantidade de cada carta. Isso ajuda a controlar o que eles têm e o que precisam.

- Criação e Gerenciamento de Decks: 
  - Permite aos jogadores montar seus decks dentro do sistema, selecionando cartas da sua coleção ou do catálogo geral. O sistema pode oferecer validação básica de regras de construção de deck (como limite de cópias da mesma carta).

- Filtros e Pesquisa Avançada:
  - Uma ferramenta essencial para encontrar cartas rapidamente. Os filtros podem incluir: nome, edição, tipo, cor/afinidade, custo, raridade, texto na carta, condição e artista.

- Visualização de Imagens das Cartas: 
  - Exibir imagens de alta qualidade das cartas é crucial para a experiência do usuário, permitindo que os jogadores as identifiquem visualmente e apreciem a arte.

- Estatísticas e Análises de Decks:
  - Oferece insights sobre os decks montados, como curva de mana, distribuição de tipos de cartas, e talvez até mesmo a probabilidade de comprar certas cartas no início do jogo.

- Marcação de Cartas Desejadas (Wishlist):
  - Jogadores podem marcar cartas que desejam adquirir para suas coleções, facilitando a busca por trocas ou compras.

- Integração com Preços de Mercado:
  - Permite buscar e exibir o preço médio de cartas em lojas online ou mercados de troca, ajudando os jogadores a avaliar o valor de suas coleções ou de cartas que desejam.

- Sistema de Trocas (Trade System):
  - Os usuários podem listar cartas para troca e procurar por cartas desejadas que outros usuários também listaram, facilitando a negociação entre eles.

- Notícias e Atualizações do Jogo:
  - Um feed de notícias sobre novas coleções, banimentos, erratas ou eventos relacionados ao TCG, mantendo os jogadores informados.

- Comentários e Avaliações de Cartas:
  - Permite que os usuários comentem e avaliem cartas, compartilhando estratégias, sinergias e opiniões sobre o impacto delas no jogo.

- Exportação de Listas de Cartas/Decks:
  - Possibilidade de exportar a lista de cartas de um deck ou da coleção em formatos comuns (texto simples, CSV, ou formatos específicos para outros simuladores de TCG).

- Histórico de Cartas:
  - Para TCGs que possuem cartas com múltiplas edições ou erratas, ter um histórico das diferentes versões de uma carta pode ser muito útil.

