<?php
class Pessoa{
    public $usuario_esperado = "admin";
    public $senha_esperada = "admin123";

    public function __construct($usuario_esperado = "admin", $senha_esperada = "admin123") {
        $this->usuario_esperado = $usuario_esperado;
        $this->senha_esperada = $senha_esperada;
    }

    public function verificarUsuario($usuario_recebido, $senha_recebida) {
    if ($usuario_recebido === $this->usuario_esperado && $senha_recebida === $this->senha_esperada) {
        echo "<h2>Login feito com sucesso!</h2>";
    } else {
        echo "<h2>Nome ou senha incorretos.</h2>";
    }
}
}
?>