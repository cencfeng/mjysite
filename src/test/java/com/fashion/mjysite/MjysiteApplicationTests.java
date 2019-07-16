package com.fashion.mjysite;

import com.fashion.mjysite.entity.Menu;
import com.fashion.mjysite.entity.User;
import com.fashion.mjysite.service.FileService;
import com.fashion.mjysite.service.MenuService;
import com.fashion.mjysite.service.UserService;
import com.sun.deploy.net.HttpResponse;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.session.Session;
import org.apache.shiro.util.ByteSource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.multipart.MultipartFile;

import java.io.*;
import java.nio.charset.Charset;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MjysiteApplicationTests {
	@Autowired
	private UserService userService;
	@Autowired
	private MenuService menuService;
	@Autowired
	private RedisTemplate redisTemplate;
	@Autowired
	private StringRedisTemplate stringRedisTemplate;
	@Autowired
	private FileService fileService;
	@Test
	public void contextLoads() {
	}
	@Test
	public void seletUserByUsername(){
		User user = userService.selectUserByUserName("20026080");
		System.out.println(user.getUsername());
		User user2 = userService.selectUserMapByUserName("20026080");
		System.out.println(user2.getUsername());
	}
	@Test
	public void md5jiami(){
		String hashAlgorithmName = "MD5";
		Object mima = "123456";
		int hashIterations = 2;
		ByteSource salt = ByteSource.Util.bytes("chengfeng");
		String result = new SimpleHash(hashAlgorithmName, mima, salt, hashIterations).toBase64();
		System.out.println(result);
	}
	@Test
	public void getMenuByUsernameTest(){
		List<Menu> menuList = menuService.getMenuByUsername("20026080");
		for (Menu menu : menuList){
			System.out.println(menu.getMenuname()+"主菜单");
			for (Menu menu1 : menu.getChildren()){
				System.out.println(menu1.getMenuname()+"子菜单");
			}
		}
	}
	@Test
	public void getRedisTest(){
		String username = stringRedisTemplate.opsForValue().get("username");
		stringRedisTemplate.opsForValue().set("love","xiaoting");
		System.out.println(stringRedisTemplate.opsForValue().get("love"));
		System.out.println(username);

	}
	@Test
    public void setRedisObject(){
	    User user = new User();
	    user.setUsername("cen");
	    user.setNickname("chengfeng");
	    redisTemplate.opsForValue().set("objecttest",user);
    }
    @Test
	public void javaSub(){
		String str = "/faceimg/**";
		String result = str.substring(str.length()-2, str.length());
		System.out.println(result);
	}
//    @Test
//	public void getShiroSession(){
//		Session session = SecurityUtils.getSubject().getSession();
//		User user = (User)session.getAttribute("user");
//		System.out.println(user.getUsername());
//	}
	@Test
	public void fdfsUploadTest() throws Exception {
//		MultipartFile multiFile  = new MockMultipartFile("");
//		File destFile = new File("....../destFile")
////转存文件到指定的路径。
//		multiFile.transferTo(destFile );


		File file = new File("D:/jielaer.jpg");
		MultipartFile mulFile = new MockMultipartFile(
				"jielaer.jpg", //文件名
				"jielaer.jpg", //originalName 相当于上传文件在客户机上的文件名
				"application/octet-stream",
				new FileInputStream(file) //文件流
		);
		String path = fileService.saveFile(mulFile);
		System.out.println(path+"111");
		//	ContentType.APPLICATION_OCTET_STREAM.toString(), //文件类型
	}
}
