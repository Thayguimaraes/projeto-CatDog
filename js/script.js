function cadastrarCliente() {
    let dadosFormularioCadastroCliente = new FormData(document.getElementById("formCadastroClientes"))
    fetch("url",
    {
        method: "POST",
        body: dadosFormularioCadastroCliente
    }).then(function(data) {
        console.log(data)
    })
}


let startForm = document.getElementById("formCadastroClientes");

startForm.addEventListener("submit", function(event) {
    event.preventDefault();
    cadastrarCliente();
})