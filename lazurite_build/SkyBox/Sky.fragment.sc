$input v_dir

#include <bgfx_shader.sh>

SAMPLER2D(s_sky_tex, 0);

void main()
{
    vec3 dir = normalize(v_dir);
    float phi = atan(dir.z, dir.x); 
    float theta = asin(dir.y);
    vec2 uv = vec2(phi / (2.0 * PI) + 0.5, theta / PI + 0.5);
    vec4 color = texture2D(s_sky_tex, uv);
    gl_FragColor = color;
}