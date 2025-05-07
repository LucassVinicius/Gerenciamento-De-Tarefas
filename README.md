Projeto de gerenciamento de tarefas, feito com Java, SpringBoot, MySQL e Postman para testar o projeto.

A estrutura do projeto foi organizada em camadas, com o controller, model, repository e service, como na imagem: ![estrutura projeto](https://github.com/user-attachments/assets/d4074c84-dba2-4ce8-9fe1-7ccdfd1ef62b)


Nesta imagem, mostra a criação de uma tarefa dentro do Postman, usando o endpoint @PostMapping:![criar tarefa](https://github.com/user-attachments/assets/eb8666dd-7be5-476a-be36-045794ef3f07)


Aqui mostra o projeto sendo testado no Postman, onde é mostrado tarefas sendo listadas por meio do endpoint @GetMapping e salvando as tarefas criadas automaticamente no MySQL: ![listar tarefas](https://github.com/user-attachments/assets/061988c6-a3ca-46ca-a8d4-00cf0f967087)
 ![listar tarefas 2](https://github.com/user-attachments/assets/71d25b9e-dd2b-47a3-8eb4-f04d0e45de58)


Teste onde mostra o método "atualizar" e o método "buscarPorId sendo testado. Consigo buscar pelo ID da tarefa corretamente e depois de atualizar a tarefa, o atributo "concluido" de valor booleano é atualizado de "false" para "true", como mostrado na imagem: ![atualizar projeto](https://github.com/user-attachments/assets/ef178752-d969-459d-9aa7-aeadc7b0f13e)


Neste teste, é mostrado o metodo "deletar" sendo executado corretamente no Postman, pelo uso do endpoint @DeleteMapping: ![delete tarefa](https://github.com/user-attachments/assets/40fc592c-de2a-4ce0-9e64-5423f855559a)
![delete tarefa 2](https://github.com/user-attachments/assets/0b8dec36-88ee-4e39-a3fb-91153cc58071)


Aqui mostra como todo projeto está conectado ao MySQL, em qualquer criação e alteração de tarefas feitas no Postman, automaticamente é alterado no MySQL também: ![MySQL tarefas](https://github.com/user-attachments/assets/e35c10e3-a3f9-4de0-847e-a983709647f0)

