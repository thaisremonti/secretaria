<head>
  <title>Unipar - Secretaria Online</title>
  <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
    integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

  <link rel="stylesheet" type="text/css" href="css/login.css">
</head>

<body class="bg">
  <form  class="form-signin form-container">
    <img class="logo" src="imagens/logo.png" alt="">
    <h1 id="titulo">Secretaria Online</h1>

    <div class="form-label-group">
      <label for="ra" class="sr-only">RA</label>
      <input type="ra" id="ra" class="form-control" placeholder="Digite seu R.A." required autofocus>
    </div>

    <div id="divSenha" class="form-label-group" style=" margin-top: 10px;">
      <label for="inputPassword" class="sr-only">Senha</label>
      <input type="password" id="password" class="form-control" placeholder="Digite sua Senha" required>
    </div>

    <!-- <input type="button" id="btnLogar" class="button btnLogar" value="Enviar"> -->
    <button type="button" id="btnLogar" class="btn btn-lg btn-block" >Enviar</button>
  </form>

  <script type="text/javascript" src="js/jquery.min.js"></script>
  <script type="text/javascript" src="js/login.js"></script>
</body>
