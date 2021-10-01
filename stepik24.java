private String printTextPerRole(String[] roles, String[] textLines) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < roles.length; i++) {
        result.append(roles[i] + ":" + "\n");
        for (int j = 0; j < textLines.length; j++) {
            if (textLines[j].startsWith(roles[i]+":")){
                StringBuilder tempString = new StringBuilder();
                tempString.append(textLines[j]);
                tempString.delete(0, roles[i].length()+1);
                result.append((j+1)+")"+tempString.toString()+"\n");                        
            }
            if (j == textLines.length-1) {
                result.append("\n");
            }
         }
    }
    return result.toString();
}
