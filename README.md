# Santader Dev Week

## Projeto Angular e Java - Tela de cotações

<details>
    <summary>Back-End</summary>
    <div>
    <p>
        Foi utilizado o site <a href="https://start.spring.io/" target="_blank" rel="noopener noreferrer">Spring Initializr</a><br>
        Ele oferece um template pronto para começar um projeto com o Maven.<br>
        O package name define as estruturas de pastas. <br>
        Foi utilizado a depedencies Spring Web, para facilitar na criação de endpoints REST. <br>
        O arquivo JAR (Java ARchive) é projeto compilado. <br>
        Deploy será no heroku, pois tem integração direta com heroku.
    </p>
    <p>
    Estrutura do projeto
    <ul>
        <li>
            src = source <br>
            <ul>
                <li>
                    main = Todos os arquivos da aplicação estão centralizados aqui. <br>
                    <ul>
                        <li>java = a classe main junto com o nome do pacote inicializa a aplicacao</li>
                        <li>resources = recursos da aplicaćão que sao utilizadas, trocamos a extensão do arquivo application de <del>properties</del> para <strong>yml</strong> para melhor visualizacão da estrutura</li>
                    </ul>
                </li>
                <li>test = Todos os testes de unidades estarão presentes nesta pasta.</li>
            </ul>
        </li>
    </ul>
    </p>
    <p>
    Um fator muito importante da utilizacao do spring, é justamente que ele facilita muitas necessidades do dia a dia do desenvolvimento, sem ter que estar reinventando a roda
    </p>
    <p>
    O maven é uma ferramenta que fica responsável pelo gerenciamento das depedências na aplicacão <br>
    Grande parte das bibliotecas estão disponíveis no site Maven Repository
    </p>
    <p>
    <h2>Objetivos</h2>
    <ol>
        <li>Aprender REST / API / JSON</li>
        <li>Criar camada de Controller</li>
        <li>Criar API's</li>
        <li>Documentar API com OPEN API</li>
    </ol>
    <ul>
        <li>A sigla REST vem de <em>Representational State Transfer</em>, é uma definićão de características fundamentais para construcã́o de aplicacões web com boas práticas.</li>
        <li>
            A sigla API vem de <em>Application Programming Interface</em>, são conjunto de rotinas e padrões estabelecidos por uma aplicaćão, é onde o front-end faz as requisićões para o back-end <br>
            <ul>
                <li><strong>GET</strong>: Obter recurso</li>
                <li><strong>POST</strong>: Criar recurso</li>
                <li><strong>PUT</strong>: Atualizar recurso</li>
                <li><strong>DELETE</strong>: Remover recurso</li>
            </ul>
        Toda resposta dos métodos HTTP são retornados com o Code Response
            <ul>
                <li><strong>1XX</strong>: Informaćões Gerais</li>
                <li><strong>2XX</strong>: Sucesso</li>
                <li><strong>3XX</strong>: Redirecionamento</li>
                <li><strong>4XX</strong>: Erros relacionados ao dados no lado servidor ou cliente</li>
                <li><strong>5XX</strong>: Erro no servidor</li>
            </ul>
        </li>    
        <li>
            <strong>JSON</strong>: Forma genérica de troca de informaćões/dados entre sistemas.
        </li>
        </ul>
    </p>
    <p>Utilizamos o controller para divisão de camadas e responsabilidades</p>
    <p>Antes de criar o endpoint, mapeie a camada do model para abstrair objetos do mundo real, no caso da aplicaćão seria "stock"<br>
    No mapeamento do model criamos o <strong>DTO</strong>: Data Transfer Object </p>
    <p>Um arquivo Bean é inicializado junto com o Main quando há anotaćão @Bean</p>
    <p>Para o Swagger UI, acessar o link http://localhost:8080/cotacoes/swagger-ui/</p>
</div>
</details>

<details>
    <summary>Front-End</summary>
    <div></div>
</details>