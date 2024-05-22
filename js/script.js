async function MyButton() {
        $.ajax({
            url:  URLBASE + "http://localhost:8080/CreateCliente",
            type: "post",
            dataType: "text",
            contentType: false,
            cache: false,
            processData: false,
            data:new FormData(document.getElementById("formCadastroClientes")),
        }).done(function(e) {
            if(e){
                showToastSaved();

            }

        })


  }
  
