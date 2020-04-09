
function logar() {
	let ra = $('#ra').val();
    let senha = $('#password').val();
    
    $.ajax({
        url:"login/logar",
        type: "GET",
        dataType: 'json',
        data: {
            "ra": ra,
            "senha": senha
        },
        error: function (xhr, status, error) {
            alert('cago');
        },
        success: function(json){
            if(json){
                alert('ok');
                window.location.replace("telaInicial.jsp");
            }else{
                alert('R.A e/ou senha invalida');
            }
        }
    });

}

$(document).ready(function () {
	$("#btnLogar").click(function (e) {
		logar();
	});
});