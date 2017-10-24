package ro.pub.cs.nets.sanitizedzk;

import java.util.LinkedList;
import java.util.List;

public class ZKPathSanitizer
{
	public static String sanitize(String path)
	{
		if (!path.startsWith("/"))
			return path;
		
		List<String> nodes = new LinkedList<>();
		String tokens[] = path.split("/");
		
		for (String token: tokens)
		{
			if (token.equals("") || token.equals("."))
				continue;
			
			if (token.equals(".."))
			{
				if (nodes.isEmpty())
					return path;
				nodes.remove(nodes.size() - 1);
				continue;
			}
			
			nodes.add(token);
		}
		
		if (nodes.isEmpty())
			return "/";
		
		String sanitizedPath = "";
		for (String node: nodes)
			sanitizedPath += "/" + node;
		return sanitizedPath;
	}
}
