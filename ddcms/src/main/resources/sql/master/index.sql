###管理员列表分页查询
#sql("getPage")
SELECT
      dms_user.name as uname,
      dms_user.email ,
      dms_user.nike_name ,
      dms_user.create_time,
      dms_role.name as rname

 FROM dms_user LEFT  JOIN dms_user_role  ON  dms_user_role.uid = dms_user.id
 JOIN dms_role ON dms_role.id = dms_user_role.rid

--  WHERE dms_user.id = (SELECT uid FROM dms_user_role WHERE dms_user_role.rid = 1)
--   AND (dms_user.name LIKE #para(searchKey)
--   OR dms_user.account LIKE #para(searchKey))
--   AND dms_user.create_time BETWEEN #para(dateStartStr) AND #para(dateEndStr)

#end