function pesquisarPorNumero() {
    const numero = document.getElementById("numero");
    const concatena = 'http://localhost:8080/contas/' + numero.value;
    window.location.href = concatena;
}