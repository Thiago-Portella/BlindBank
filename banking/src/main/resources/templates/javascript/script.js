function pesquisarPorNumero() {
    let numero = document.getElementById("numero");
    let concatena = 'http://localhost:8080/contas/' + numero.value;
    window.location.href = concatena;
}