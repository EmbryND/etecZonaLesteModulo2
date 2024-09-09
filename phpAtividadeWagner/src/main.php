<section>
    <h1>Entre na sua conta!</h1>

    <form action="index.php" method="post">
        <label for="nome">Usuário:</label>
        <input type="text" name="nome" id="nome"><br><br>
        <label for="senha">Senha:</label>
        <input type="password" name="senha" id="senha"><br><br>
        <button type="submit" name="submit" value="btnEnviar">Enviar</button>
    <?php
    include './model/pessoa.php';
    if (isset($_POST['submit'])) {
        $usuario_recebido = $_POST['nome'];
        $senha_recebida = $_POST['senha'];
    }
    $p1 = new Pessoa();
    $p1->verificarUsuario($usuario_recebido, $senha_recebida);
    ?>
</section>