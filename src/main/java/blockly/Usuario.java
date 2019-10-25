package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Usuario {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// Usuario
public static Var Executar() throws Exception {
 return new Callable<Var>() {

   private Var dadosUsuario = Var.VAR_NULL;

   public Var call() throws Exception {
    return cronapi.util.Operations.getCurrentUserName();
   }
 }.call();
}

/**
 *
 * @param foto
 */
// Descreva esta função...
public static void atualizarFotoUsuarioLogado(Var foto) throws Exception {
  new Callable<Var>() {

   public Var call() throws Exception {
    cronapi.database.Operations.execute(Var.valueOf("app.entity.User"), Var.valueOf("update User set picture = :picture where login = :login"),Var.valueOf("picture",foto),Var.valueOf("login",cronapi.util.Operations.getCurrentUserName()));
    cronapi.util.Operations.callClientFunction( Var.valueOf("cronapi.screen.notify"), Var.valueOf("success"), Var.valueOf("Foto de perfil atualizada com sucesso!"));
   return Var.VAR_NULL;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var obterIdUsuarioLogado() throws Exception {
 return new Callable<Var>() {

   private Var dadosUsuario = Var.VAR_NULL;

   public Var call() throws Exception {
    dadosUsuario = cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u from User u where u.login = :login"),Var.valueOf("login",cronapi.util.Operations.getCurrentUserName()));
    return cronapi.database.Operations.getField(dadosUsuario, Var.valueOf("this[0].id"));
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var obterLoginUsuarioLogado() throws Exception {
 return new Callable<Var>() {

   private Var dadosUsuario = Var.VAR_NULL;

   public Var call() throws Exception {
    return cronapi.util.Operations.getCurrentUserName();
   }
 }.call();
}

}

