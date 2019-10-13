
SELECT o_user.name as user_name, o_group.name AS group_name
FROM 
(
    SELECT o.name,r.group_id
    FROM objects AS o 
    LEFT JOIN relations AS r ON r.user_id = o.id
    WHERE o.id NOT IN (SELECT group_id FROM relations)
) AS o_user
LEFT JOIN objects AS o_group
ON o_user.group_id = o_group.id;



