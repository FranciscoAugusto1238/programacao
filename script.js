function mensagem() {
    //variáveis
    var nome = document.getElementById("contato-nome");
    var email = document.getElementById("contato-email");
    var mensagem = document.getElementById("contato-mensagem");

    //verificar se nenhum campo está vazio
    if (nome.value == "") {
        alert("Nome não informado!")

        nome.focus();

    } else if (email.value == "") {
        alert("Email não informado!")

        email.focus();

    } else if (mensagem.value == "") {
        alert("Mensagem não informada!")

        mensagem.focus();

    } else {
        alert("Mensagem enviada com sucesso!")
    }

}