<%@ page language="java" contentType="text/html;charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.*,bean.*,java.sql.*"%>
<form action='updateHero' mehtod='post'>
    名字:<input type='text' name='name' value='${hero.name}'><br>
    血量:<input type='text' name='hp' value='${hero.hp}'><br>
    伤害:<input type='text' name='damage' value='${hero.damage}'><br>
    <input type='hidden' name='id' value='${herom.id}'>
    <input type='submit' value='更新'>
</form>